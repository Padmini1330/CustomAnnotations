package CustomAnnotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented									//whether to put the annotation in java docs
@Inherited									//specifies whether subclasses get the annotation
@Target(ElementType.METHOD)					//specifies places the annotation can go					
@Retention(RetentionPolicy.RUNTIME)			//Specifies when the annotation is needed
public @interface MethodInfo 
{
	String author() default "Padmini";
	String date();
	int revision() default 1;
	String comments();
}
