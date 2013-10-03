/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import java.util.ArrayList;

/**
 *
 * @author 
 */
public class Schedule {
    private Course subject;
    private String schedule;
    private Classroom numberClassroom;
    private Professor professor;

    /**
     *
     * @param subject
     * @param schedule
     * @param numberClassroom
     * @param professor
     */
    public Schedule(Course subject, String schedule, Classroom numberClassroom, Professor professor) {
        this.subject = subject;
        this.schedule = schedule;
        this.numberClassroom = numberClassroom;
        this.professor = professor;
    }


    /**
     *
     * @return
     */
    public Course getSubject() {
        return subject;
    }

    /**
     *
     * @param subject
     */
    public void setSubject(Course subject) {
        this.subject = subject;
    }

    /**
     *
     * @return
     */
    public String getSchedule() {
        return schedule;
    }

    /**
     *
     * @param schedule
     */
    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    /**
     *
     * @return
     */
    public Classroom getNumberClassroom() {
        return numberClassroom;
    }

    /**
     *
     * @param numberClassroom
     */
    public void setNumberClassroom(Classroom numberClassroom) {
        this.numberClassroom = numberClassroom;
    }

    /**
     *
     * @return
     */
    public Professor getProfessor() {
        return professor;
    }

    /**
     *
     * @param professor
     */
    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
    
    
    
    
}
