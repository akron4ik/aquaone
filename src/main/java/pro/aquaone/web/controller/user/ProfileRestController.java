package pro.aquaone.web.controller.user;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;
import pro.aquaone.AuthorizedUser;
import pro.aquaone.model.Cart;
import pro.aquaone.to.UserTo;

import javax.validation.Valid;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@RestController
@RequestMapping("/profile")
public class ProfileRestController extends AbstractRestController {

    @GetMapping
    public String profile(ModelMap model, @AuthenticationPrincipal AuthorizedUser authUser,
                          @RequestParam(required = false) LocalDate startDate,
                          @RequestParam(required = false) LocalTime startTime,
                          @RequestParam(required = false) LocalDate endDate,
                          @RequestParam(required = false) LocalTime endTime) {
        model.addAttribute("userTo", authUser.getUserTo());
        model.addAttribute("userCarts", super.getBetweenWithId(startDate, startTime, endDate, endTime));
        return "profile";
    }

    @PostMapping
    public String updateProfile(@Valid UserTo userTo, BindingResult result, SessionStatus status,
                                @AuthenticationPrincipal AuthorizedUser authUser) {
        if (result.hasErrors()) {
            return "profile";
        }
        super.update(userTo, authUser.getId());
        authUser.update(userTo);
        status.setComplete();
        return "redirect:/";
    }

    @GetMapping("/carts")
    public List<Cart> getCarts(
            @RequestParam(required = false) LocalDate startDate,
            @RequestParam(required = false) LocalTime startTime,
            @RequestParam(required = false) LocalDate endDate,
            @RequestParam(required = false) LocalTime endTime){
        return super.getBetweenWithId(startDate, startTime, endDate, endTime);
    }


    @GetMapping("/register")
    public String register(ModelMap model) {
        model.addAttribute("userTo", new UserTo());
        model.addAttribute("register", true);
        return "profile";
    }

    @PostMapping("/register")
    public String saveRegister(@Valid UserTo userTo, BindingResult result, SessionStatus status, ModelMap model) {
        if (result.hasErrors()) {
            model.addAttribute("register", true);
            return "profile";
        }
        super.create(userTo);
        status.setComplete();
        return "redirect:/login?message=app.registered&username=" + userTo.getEmail();
    }


}

