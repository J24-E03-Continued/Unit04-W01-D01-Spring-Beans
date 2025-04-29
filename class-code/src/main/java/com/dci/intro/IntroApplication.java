package com.dci.intro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.util.List;

@SpringBootApplication
@ComponentScan(basePackages = {
		"com.dci.intro",
		"outside"
})
public class IntroApplication implements CommandLineRunner {
//	3 ways to inject dependancies
//	1. field injection
//	2. constructor injection
//	3. setter injection

//	1. Field Injection
//	@Autowired
	GameRunner gameRunner;
	private final SingletonBean singletonBean1;
	private final SingletonBean singletonBean2;
	private final SingletonBean singletonBean3;
	private final ProtypeBean protypeBean1;
	private final ProtypeBean protypeBean2;
	private final ProtypeBean protypeBean3;





//	2. constructor injection
	@Autowired
	public IntroApplication(GameRunner gameRunner, SingletonBean singletonBean1, SingletonBean singletonBean2, SingletonBean singletonBean3, ProtypeBean protypeBean1, ProtypeBean protypeBean2, ProtypeBean protypeBean3) {
		this.gameRunner = gameRunner;
        this.singletonBean1 = singletonBean1;
        this.singletonBean2 = singletonBean2;
        this.singletonBean3 = singletonBean3;
        this.protypeBean1 = protypeBean1;
        this.protypeBean2 = protypeBean2;
        this.protypeBean3 = protypeBean3;
    }


//	3. Setter Injection
//	@Autowired
	public void setGameRunner(GameRunner gameRunner){
		this.gameRunner = gameRunner;
	}


	public static void main(String[] args) {
		var context = SpringApplication.run(IntroApplication.class, args);


//		displays all the beans I have in my application
		String[] allBeans = context.getBeanDefinitionNames();
		for (String beanName : allBeans) {
			Object bean = context.getBean(beanName);
			String className = bean.getClass().getName();

			if (className.startsWith("com.dci") || bean instanceof String || bean instanceof List<?>) {
				System.out.println(beanName + " -> " + bean);
			}
		}



	}




	@Override
	public void run(String... args) throws Exception {

		System.out.println("Dependancies have been injected");
		gameRunner.run();

		System.out.println(singletonBean1);
		System.out.println(singletonBean2);
		System.out.println(singletonBean3);

	}
}
