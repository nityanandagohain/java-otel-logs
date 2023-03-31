

* `OTEL_METRICS_EXPORTER=none OTEL_LOGS_EXPORTER=otlp OTEL_TRACES_EXPORTER=none OTEL_EXPORTER_OTLP_ENDPOINT="http://localhost:4317" OTEL_RESOURCE_ATTRIBUTES=service.name=petclinick java -javaagent:"/Users/nityanandagohain/projects/examples/dummy.signoz/opentelemetry-javaagent-1.jar" -jar target/*.ja`

* ` curl http://localhost:8080/hello-world`