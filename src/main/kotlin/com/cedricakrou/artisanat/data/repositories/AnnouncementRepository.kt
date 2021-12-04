package com.cedricakrou.artisanat.data.repositories

import com.cedricakrou.artisanat.domain.announcement.entity.Announcement
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface AnnouncementRepository : JpaRepository<Announcement, Long>  {

    fun findAllByClient_Username( username : String ) : List<Announcement>
    fun findAllBySpeciality_Id( id : Long ) : List<Announcement>

}