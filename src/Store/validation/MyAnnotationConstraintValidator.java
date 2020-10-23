package Store.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class MyAnnotationConstraintValidator 
	implements ConstraintValidator<MyAnnotation,String>{
	private String annotationPrefix;

	@Override
	public boolean isValid(String theAnnotation, ConstraintValidatorContext theConstraintValidatorContext) {

		boolean result;
		if(theAnnotation!=null) {
			result = theAnnotation.startsWith(annotationPrefix);
		}else {
			result=true;
		}
		return result;
	}
	
	@Override
	public void initialize(MyAnnotation theMyAnnotation) {
		annotationPrefix= theMyAnnotation.value();
	}
}
