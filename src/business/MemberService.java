package business;

import dal.MemberManager;
import entities.auth.Member;

import java.util.List;

public class MemberService extends Service<Member> {

    public MemberService() {
        super(new MemberManager());
    }

    @Override
    public Member getById(String id) {
        return null;
    }

    @Override
    public List<Member> getAll() {
        return List.of();
    }

    @Override
    public void create(Member member) {}

    @Override
    public void update(Member member) {}

    @Override
    public void delete(String id) {}
}
