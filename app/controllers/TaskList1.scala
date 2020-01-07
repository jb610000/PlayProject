package controllers

import javax.inject._
import play.api.mvc._
import play.api.i18n._


@Singleton
class TaskList1 @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  def login = Action{
    Ok(views.html.login1())
  }

  def validatelogin(Username: String, Password: String) = Action{
    Ok("login successfull")
  }

  def validateloginPost = Action { request =>
    val postVals = request.body.asFormUrlEncoded
    Ok("")
  }
  def taskList1 = Action{
    val tasks = List("cake","bread","flour","yeast","chocolate")
    Ok(views.html.taskList1(tasks))
  }
//new view that displays shopping lsit
}
