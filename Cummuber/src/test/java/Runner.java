import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class) 
CucumberOptions(feature= {"/Users/kanclan/Desktop/Bittech/Cummuber/login.feature"}, tag= {"@smoke"},plugin= {"pretty","})
public class Runner {

}
