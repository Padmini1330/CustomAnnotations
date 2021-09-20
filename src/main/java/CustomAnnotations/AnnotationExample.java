package CustomAnnotations;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class AnnotationExample 
{
	@Override
	@MethodInfo(author = "padmini", comments = "Main mathod", date = "Sept 20 2021", revision = 1)
	public String toString() 
	{
		return "Overrided toString method";
	}

	public static void main(String[] args) 
	{
		try 
		{
			for(Method method: AnnotationExample.class.getMethods()) 
			{
				if(method.isAnnotationPresent(MethodInfo.class)) 
				{
					try 
					{
						for(Annotation anno : method.getDeclaredAnnotations()) 
						{
							System.out.println("Annotation in method: "+method+" : "+anno);
						}
						MethodInfo methodAnno = method.getAnnotation(MethodInfo.class);
						if(methodAnno.revision()==1) 
						{
							System.out.println("Method with revision 1: "+method);
						}
					}
					catch (Throwable e) 
					{
						e.printStackTrace();
					}
				}
			}
		}
		catch (SecurityException e) 
		{
			e.printStackTrace();
		}
	}

}
