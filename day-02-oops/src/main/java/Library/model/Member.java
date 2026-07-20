package Library.model;

import Library.contracts.Notifiable;

public class Member extends Person implements Notifiable {
    private String membershipType;
    public Member(int id,String name,String membershipType){
        super(id,name);
        if(membershipType==null || membershipType.isBlank()){
            throw new IllegalArgumentException("Membership cannot be null");
        }
        this.membershipType=membershipType;

    }
    public String getMembershipType(){
        return membershipType;
    }

    @Override
    public void sendNotification() {
        System.out.println("Notification sent to member: "+getName());
    }
}
