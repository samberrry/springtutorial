package com.myspring.di;

/**
 * Created by Hessam on 5/8/17.
 */
public class TextEditor {
    private SpellChecker spellChecker;
    private String name;
    public void setSpellChecker(SpellChecker spellChecker){
        System.out.println("Inside setSpellChecker.");
        this.spellChecker = spellChecker;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SpellChecker getSpellChecker() {
        return spellChecker;
    }
    public void spellCheck(){
        spellChecker.checkSpelling();
    }
}
