package com.myspring.di;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Hessam on 5/8/17.
 */
public class TextEditor {
    private SpellChecker spellChecker;
    private String name;

    public TextEditor() {
        System.out.println("Inside TextEditor constructor." );
    }

    @Autowired
    public TextEditor(SpellChecker spellChecker) {
        System.out.println("Inside TextEditor constructor." );
        this.spellChecker = spellChecker;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public SpellChecker getSpellChecker() {
//        return spellChecker;
//    }
    public void spellCheck(){
        spellChecker.checkSpelling();
    }
}
