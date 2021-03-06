package koitt.ratta.doeat.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import koitt.ratta.doeat.domain.GalleryLikeVo;
import koitt.ratta.doeat.service.LikeService;

@RestController
public class LikeController {
	
	@Autowired
	LikeService service;
	
	// 갤러리 게시글 좋아요
	@GetMapping("gallery_like")
	public int addLike(int gIdx, Model model) {
		GalleryLikeVo galleryLikeVo = GalleryLikeVo.builder().gIdx(gIdx).build();
		return service.addLike(galleryLikeVo);
	}

}
