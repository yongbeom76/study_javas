package beans;

public class DataInfors {
    public MemberBean getDataWithMemberBean() {
        MemberBean memberBean = new MemberBean();
        memberBean.setFirstname("Mark");
        memberBean.setSecondName("Otto");
        memberBean.setHandleName("@mdo");

        return memberBean;
    }
}
