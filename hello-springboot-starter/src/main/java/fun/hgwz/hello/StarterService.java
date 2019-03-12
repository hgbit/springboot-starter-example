package fun.hgwz.hello;

import org.springframework.util.StringUtils;

/**
 * StarterService.
 *
 * @author huangguan
 * @since 2019-03-09
 */
public class StarterService {

    private String config;

    public StarterService(String config) {
        this.config = config;
    }

    public String[] split(String separatorChar) {
        return StringUtils.split(this.config, separatorChar);
    }

}
