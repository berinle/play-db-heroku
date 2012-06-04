package controllers;

import play.*;
import play.data.*;

import play.mvc.*;
import models.*;

import views.html.*;

public class Application extends Controller {
  
  final static Form<Person> personForm = form(Person.class);

  public static Result index() {
//    return ok(index.render("Your new application is ready."));

    return ok(person.render(personForm, Person.list()));
  }

  public static Result create(){
  	Form<Person> filledForm = personForm.bindFromRequest();
  	if(filledForm.hasErrors()){
  		return badRequest(person.render(filledForm, Person.list()));
  	}

  	Person p = filledForm.get();
  	p.save();

    return ok(person.render(personForm, Person.list()));
  }

  public static Result delete(Long id){
      System.out.println("delete called.");
  	Person.delete(id);
    return ok(person.render(personForm, Person.list()));
  }
  
}