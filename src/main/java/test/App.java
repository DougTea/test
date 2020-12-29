package test;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

    public static AuthorizeConfigurer predicate(){
        //lamda expression got problem:The type HttpSecurity from the descriptor computed for the target context is not visible here.  
        return authorization-> authorization.anyRequest().permitAll();
    }
}
