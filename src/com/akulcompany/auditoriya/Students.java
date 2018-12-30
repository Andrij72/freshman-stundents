package com.akulcompany.auditoriya;

import com.akulcompany.enums.MyVote;

public class Students {
    private String name;

    public Students() {    }

    public String getSecondname() {
        return name;
    }

    public void Setname(String name) {
        this.name =name;
    }


    // ---------студент голосує за старосту групи
    //Правила голосування.    Відповідає якостям: має адміністративний досвід, активна громадська позиція,
    // участь у реалпроектах.  Переможець на посаду <Старости> відповідає всім цим якостям і набрав максимальну к-ть голосів
    public void MyVote (Students st,MyVote vt){
        // тут повидна бути логіка, як голосує Так чи Ні.
      this.name= st;
       vt= MyVote.YES;





    }
}
