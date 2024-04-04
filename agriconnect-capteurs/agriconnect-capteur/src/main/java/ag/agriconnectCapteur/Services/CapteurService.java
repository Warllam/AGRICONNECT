package ag.agriconnectCapteur.Services;

import ag.agriconnectCapteur.Entities.Capteur;
import ag.agriconnectCapteur.Exceptions.CapteurNotFoundException;
import ag.agriconnectCapteur.Repositories.CapteurRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CapteurService {

    private CapteurRepository capteurRepository;

    public Capteur save(Capteur capteur){
        return capteurRepository.save(capteur);
    }

    public Capteur update(Capteur capteur) throws CapteurNotFoundException{
        try{
            Capteur capteur1 = capteurRepository.findById(capteur.getId()).get();
            capteur1.setHumidite(capteur.getHumidite());
            capteur1.setTemperature(capteur.getTemperature());
            capteur1.setLongitude(capteur.getLongitude());
            capteur1.setLatitude(capteur.getLatitude());
            return capteurRepository.save(capteur1);
        }catch (NullPointerException e){
            throw new CapteurNotFoundException();
        }
    }

    public Capteur getCapteur(long idCapteur) throws CapteurNotFoundException {
        return capteurRepository.findById(idCapteur).orElseThrow(() -> new CapteurNotFoundException());
    }

    public List<Capteur> getAll(){
        return capteurRepository.findAll();
    }

    public double getTemperture(long idCapteur) throws CapteurNotFoundException {
        try {
            return capteurRepository.findById(idCapteur).get().getTemperature();
        }catch (NullPointerException e){
            throw new CapteurNotFoundException();
        }
    }

    public int getHumidite(long idCapteur) throws CapteurNotFoundException {
        try{
            return capteurRepository.findById(idCapteur).get().getHumidite();
        }catch (NullPointerException e){
            throw new CapteurNotFoundException();
        }
    }

    public Capteur changerIntervalle(long idCapteur, int intervalle) throws CapteurNotFoundException {
        try {
            Capteur capteur = capteurRepository.findById(idCapteur).get();
            capteur.setIntervalle(intervalle);
            return capteurRepository.save(capteur);
        }catch (NullPointerException e){
            throw new CapteurNotFoundException();
        }
    }

    public List<Capteur> changerAllIntervalles(int intervalle) {
        List<Capteur> capteurList= capteurRepository.findAll();
        for(Capteur c : capteurList){
            c.setIntervalle(intervalle);
        }
        return capteurRepository.saveAllAndFlush(capteurList);
    }

}
