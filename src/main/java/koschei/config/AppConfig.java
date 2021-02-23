package koschei.config;

import koschei.KoscheiTheDeathless;
import koschei.models.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "koschei")
public class AppConfig {

    @Bean
    public static Island2 getIsland(Wood3 wood3) {
        return new Island2(wood3);
    }

    @Bean
    public static Needle7 getNeedle(){
        return new Needle7();
    }

    @Bean
    public static Egg6 getEgg(Needle7 needle7){
        return new Egg6(needle7);
    }

    @Bean
    public static Duck5 getDuck(Egg6 egg6){
        return new Duck5(egg6);
    }

    @Bean
    public static Rabbit4 getRabbit(Duck5 duck5){
        return new Rabbit4(duck5);
    }

    @Bean
    public static Wood3 getWood(Rabbit4 rabbit4){
        return new Wood3(rabbit4);
    }

    @Bean
    public static Ocean1 getOcean(){
        return new Ocean1();
    }

    @Bean
    public static KoscheiTheDeathless koscheiTheDeathless(){
        return new KoscheiTheDeathless();
    }
}
