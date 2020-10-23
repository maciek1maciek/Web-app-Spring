package Store.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy=MyAnnotationConstraintValidator.class)
@Target({ElementType.FIELD,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {
	public String value() default "P" ;
	public String message() default "Number starts with P";
	public Class<?>[]groups() default{};
	public Class<? extends Payload>[] payload() default{};
	
}
