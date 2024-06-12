# AGRICONNECT

## Docker run 
### Zipkin
docker run -d -p 9411:9411 --name zipkin openzipkin/zipkin

### Prom
docker run --name my-prometheus --mount type=bind,source=<CHEMAINABSOLU>/prometheus.yml,destination=/etc/prometheus/prometheus.yml -p 9090:9090 prom/prometheus

