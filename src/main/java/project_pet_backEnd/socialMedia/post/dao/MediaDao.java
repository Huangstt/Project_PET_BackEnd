package project_pet_backEnd.socialMedia.post.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import project_pet_backEnd.socialMedia.post.vo.MediaData;

import java.util.List;

public interface MediaDao extends JpaRepository<MediaData, Integer> {

    @Override
    List<MediaData> findAll();
}
