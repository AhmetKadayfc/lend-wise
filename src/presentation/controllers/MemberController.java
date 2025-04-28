package presentation.controllers;

import business.MemberService;
import entities.auth.Member;

import java.util.Scanner;

public class MemberController extends Controller<Member> {

    public MemberController(Scanner scanner) {
        super(scanner, new MemberService());
    }

    @Override
    public void getAll() {}

    @Override
    public void getById() {}

    @Override
    public void create() {
    }

    @Override
    public void update() {}

    @Override
    public void delete() {}
}