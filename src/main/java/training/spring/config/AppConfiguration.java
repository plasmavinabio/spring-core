package training.spring.config;

import training.spring.lang.Language;
import training.spring.lang.impl.Vietnamese;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"training.spring.bean"})
public class AppConfiguration {

	@Bean(name = "language")
	public Language getLanguage() {
		
		return new Vietnamese();
	}
}
