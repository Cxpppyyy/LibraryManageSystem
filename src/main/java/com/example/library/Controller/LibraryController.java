package com.example.library.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

@CrossOrigin(origins = "*",maxAge = 3600)
@Controller
public class LibraryController {
    @GetMapping("/library-homepage")
    public String libraryHomepage() {
        return "LibraryHomepage";
    }
    @GetMapping("/library-addpage")
    public String libraryAddPage() {
        return "LibraryAddpage";
    }
    @GetMapping("/library-searchpage")
    public String librarySearchPage() {
        return "LibrarySearchpage";
    }
    @GetMapping("/library-userinfo")
    public String libraryUserinfo() {
        return "LibraryUserinfo";
    }
}

