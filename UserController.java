@Controller
public class UserController {

	//로그인 페이지로 이동
	@RequestMapping("/user/login.do")
	public String login() {

		logger.info("경로 : login");
		return "user/login";
	}


	//회원추가
	@RequestMapping("/user/insert.do")
	public String insert() {

		logger.info("경로 : insert");
		return "user/insert";
	}

	//회원정보수정
	@RequestMapping("/user/update.do")
	public String update() {

		logger.info("경로 : update");
		return "user/update";
	}

	
}