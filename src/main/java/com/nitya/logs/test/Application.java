package com.nitya.logs.test;

// import org.springframework.asm.Attribute;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// import io.opentelemetry.api.GlobalOpenTelemetry;
// import io.opentelemetry.api.logs.GlobalLoggerProvider;
// import io.opentelemetry.sdk.OpenTelemetrySdk;
// import io.opentelemetry.sdk.logs.SdkLoggerProvider;
// import io.opentelemetry.sdk.resources.Resource;
// import io.opentelemetry.sdk.trace.SdkTracerProvider;
// import io.opentelemetry.sdk.logs.export.BatchLogRecordProcessor;
// import io.opentelemetry.exporter.otlp.logs.OtlpGrpcLogRecordExporter;
// import io.opentelemetry.semconv.resource.attributes.ResourceAttributes;

// import io.opentelemetry.api.logs.GlobalLoggerProvider;
// import io.opentelemetry.sdk.logs.SdkLoggerProvider;
// import io.opentelemetry.sdk.resources.Resource;
// import io.opentelemetry.api.common.Attributes;
// import org.slf4j.bridge.SLF4JBridgeHandler;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		initializeOpenTelemetry();

		SpringApplication.run(Application.class, args);
	}

	private static void initializeOpenTelemetry() {
		// OpenTelemetrySdk sdk = OpenTelemetrySdk.builder()
		// .setTracerProvider(SdkTracerProvider.builder().build())
		// .setLoggerProvider(
		// SdkLoggerProvider.builder()
		// .setResource(
		// Resource.getDefault().toBuilder()
		// .put(ResourceAttributes.SERVICE_NAME, "log4j-example")
		// .build())
		// .addLogRecordProcessor(
		// BatchLogRecordProcessor.builder(
		// OtlpGrpcLogRecordExporter.builder()
		// .setEndpoint("http://localhost:4310")
		// .build())
		// .build())
		// .build())
		// .build();
		// GlobalOpenTelemetry.set(sdk);
		// GlobalLoggerProvider.set(sdk.getSdkLoggerProvider());

		// Add hook to close SDK, which flushes logs
		// Runtime.getRuntime().addShutdownHook(new Thread(sdk::close));
	}

}
