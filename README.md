# AGRICONNECT

## Docker run 
### Zipkin
docker run -d -p 9411:9411 --name ac-zipkin openzipkin/zipkin

### Prom
docker run --name ac-prometheus --mount type=bind,source= <"Lien absolue"> /prometheus.yml,destination=/etc/prometheus/prometheus.yml -p 9090:9090 prom/prometheus

