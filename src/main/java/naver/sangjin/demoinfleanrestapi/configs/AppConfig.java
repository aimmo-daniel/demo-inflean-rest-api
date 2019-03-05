package naver.sangjin.demoinfleanrestapi.configs;

import naver.sangjin.demoinfleanrestapi.accounts.Account;
import naver.sangjin.demoinfleanrestapi.accounts.AccountService;
import naver.sangjin.demoinfleanrestapi.accounts.AccounteRole;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.Set;

@Configuration
public class AppConfig {

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return PasswordEncoderFactories.createDelegatingPasswordEncoder();
    }

/*    @Bean
    public ApplicationRunner applicationRunner() {
        return new ApplicationRunner() {

            @Autowired
            AccountService accountService;

            @Override
            public void run(ApplicationArguments args) throws Exception {
                Account sangjin = Account.builder()
                        .email("sangjin@email.com")
                        .password("sangjin")
                        .roles(Set.of(AccounteRole.ADMIN, AccounteRole.USER))
                        .build();
                accountService.saveAccount(sangjin);
            }
        };
    }*/
}
