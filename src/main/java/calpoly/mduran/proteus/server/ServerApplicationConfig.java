package calpoly.mduran.proteus.server;

import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import org.springframework.content.s3.config.EnableS3Stores;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableS3Stores
public class ServerApplicationConfig {

    @Bean
    public AmazonS3 client() {
        // Default client expects AWS_ACCESS_KEY_ID ,AWS_SECRET_ACCESSS_KEY environment variables to be set
        return AmazonS3ClientBuilder.defaultClient();
    }
}
