# AGRICONNECT

## Docker run 
### Zipkin
docker run -d -p 9411:9411 --name zipkin openzipkin/zipkin

### Prom
docker run --name my-prometheus --mount type=bind,source=C:\Users\Paul-ArthurNavaud\Documents\git\AGRICONNECT\prometheus.yml,destination=/etc/prometheus/prometheus.yml -p 9090:9090 prom/prometheus

