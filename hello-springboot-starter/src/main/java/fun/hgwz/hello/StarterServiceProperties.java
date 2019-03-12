package fun.hgwz.hello;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * StarterServiceProperties.
 *
 * @author huangguan
 * @since 2019-03-09
 */
@ConfigurationProperties("hello.service")
public class StarterServiceProperties {

    private String config;

    public void setConfig(String config) {
        this.config = config;
    }

    public String getConfig() {
        return config;
    }
}
