export class Myservice{
    checkUserInfo(login:any):string {
        if(login.emailId == "chandu@email.com" && login.password =="123"){
            return "success"
        } else {
            return "failure"
        }
    }
}