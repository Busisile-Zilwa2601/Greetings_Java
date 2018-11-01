class Greetings{
    
    private String name;
    private String lang;
    Greetings(){
        super();
        name = "";
        lang = "";
    }
    Greetings(String myName, String myLang){
        name = myName;
        lang = myLang;
    }

    public String getName(){
        return name;
    }
    public String getLanguage(){
        return lang;
    }

    public String greet(String name, String lang){
        switch(lang){
            case "isiXhosa":
                this.name = name;
                this.lang = lang;
                return "Molo "+ this.name;
            case "English":
                this.name = name;
                this.lang = lang;
                return "Hello "+ this.name;
           case "Afrikaans":
                this.name = name;
                this.lang = lang;
                return "Hallo "+ this.name;
            default:
                return "Please select one of the given languages";
        }            
    }
}