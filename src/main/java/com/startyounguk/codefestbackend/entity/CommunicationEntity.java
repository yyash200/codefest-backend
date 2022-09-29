package com.startyounguk.codefestbackend.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "communication_master")
public class CommunicationEntity {

    @Id
    @GeneratedValue
    @Column(name = "msg_id")
    private Integer msgId;

    @Column(name = "FROM_USER")
    private Integer fromUser;

    @Column(name = "to_child")
    private Integer toChild;

    @Column(name = "DATE_SUBMITTED")
    private Date dateSubmitted;

    @Column(name = "message")
    private String message;

    @Column(name = "ML_CHECK_STATUS")
    private String mlCheckStatus;

    @Column(name = "ML_COMMENTS")
    private String mlComments;

    @Column(name = "MSG_STATUS")
    private String msgStatus;

    @Column(name = "REVIEWED_BY")
    private Integer reviewedBy;

    @Column(name = "REVIEWED_ON")
    private Date reviewedOn;

    @Column(name = "COMMENTS")
    private String comments;

    public Integer getMsgId() {
        return msgId;
    }

    public void setMsgId(Integer msgId) {
        this.msgId = msgId;
    }

    public Integer getFromUser() {
        return fromUser;
    }

    public void setFromUser(Integer fromUser) {
        this.fromUser = fromUser;
    }

    public Integer getToChild() {
        return toChild;
    }

    public void setToChild(Integer toChild) {
        this.toChild = toChild;
    }

    public Date getDateSubmitted() {
        return dateSubmitted;
    }

    public void setDateSubmitted(Date dateSubmitted) {
        this.dateSubmitted = dateSubmitted;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMlCheckStatus() {
        return mlCheckStatus;
    }

    public void setMlCheckStatus(String mlCheckStatus) {
        this.mlCheckStatus = mlCheckStatus;
    }

    public String getMlComments() {
        return mlComments;
    }

    public void setMlComments(String mlComments) {
        this.mlComments = mlComments;
    }

    public String getMsgStatus() {
        return msgStatus;
    }

    public void setMsgStatus(String msgStatus) {
        this.msgStatus = msgStatus;
    }

    public Integer getReviewedBy() {
        return reviewedBy;
    }

    public void setReviewedBy(Integer reviewedBy) {
        this.reviewedBy = reviewedBy;
    }

    public Date getReviewedOn() {
        return reviewedOn;
    }

    public void setReviewedOn(Date reviewedOn) {
        this.reviewedOn = reviewedOn;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
}
