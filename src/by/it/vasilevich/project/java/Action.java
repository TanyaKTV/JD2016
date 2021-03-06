package by.it.vasilevich.project.java;


public enum Action {
    INDEX {
        {
            this.command = new CommandIndex();
            this.inPage="/index.jsp";
            this.okPage ="/index.jsp";
        }
    },
    SIGNUP {
        {
            this.command = new CommandSignUp();
            this.inPage="/signup.jsp";
            this.okPage ="/login.jsp";
        }
    },
    LOGIN {
        {
            this.command = new CommandLogin();
            this.inPage="/login.jsp";
            this.okPage ="/main.jsp";
        }
    },
    PROFILE {
        {
            this.command = new CommandProfile();
            this.inPage="/profile.jsp";
            this.okPage ="/login.jsp";
        }
    },
    CREATEAD {
        {
            this.command = new CommandCreateAd();
            this.inPage="/createad.jsp";
            this.okPage ="/";
        }
    },
    ALLUSERS {
        {
            this.command = new CommandAllUsers();
            this.inPage="/allusers.jsp";
            this.okPage ="/allusers.jsp";
        }
    },
    ERROR {
        {
//            this.command = new CommandLogout();
        }
    };
    protected ActionCommand command=new CommandError();
    public String inPage="/error.jsp";
    public String okPage ="/error.jsp";


    public ActionCommand getCurrentCommand() {
        return command;
    }

    public static final String msgError="msg_error";
    public static final String msgMessage="message";

}