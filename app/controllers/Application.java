package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.index;

/**
 * Controller for application.
 */
public class Application extends Controller {

  /**
   * Controller for main page.
   * @return Rendered results.
   */
  public static Result index() {
    return ok(index.render("Your new application is ready."));
  }

}
