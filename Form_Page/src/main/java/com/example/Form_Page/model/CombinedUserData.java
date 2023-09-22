package com.example.Form_Page.model;

public class CombinedUserData {
  private BasicData basicData;

  private QuestionData questionData;

  /**
   * @return basicData
   */
  public BasicData getBasicData() {

    return this.basicData;
  }

  /**
   * @param basicData new value of {@link #getbasicData}.
   */
  public void setBasicData(BasicData basicData) {

    this.basicData = basicData;
  }

  /**
   * @return questionData
   */
  public QuestionData getQuestionData() {

    return this.questionData;
  }

  /**
   * @param questionData new value of {@link #getquestionData}.
   */
  public void setQuestionData(QuestionData questionData) {

    this.questionData = questionData;
  }

  // Getters and setters for basicData and questionData

}