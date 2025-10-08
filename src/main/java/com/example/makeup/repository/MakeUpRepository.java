package com.example.makeup.repository;
import com.example.makeup.entities.MakeUp;
import com.example.makeup.entities.Marque;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(path = "rest")
public interface MakeUpRepository extends JpaRepository<MakeUp,Long>{
    List<MakeUp> findByDesignation(String designation);

    List<MakeUp> findByDesignationContains(String designation);

    /*@Query("select m from MakeUp m where m.designation like %?1 and m.tarif > ?2")
    List<MakeUp> findByTarif (String designation, Double tarif);*/

    @Query("select m from MakeUp m where m.designation like %:designation and m.tarif > :tarif")
    List<MakeUp> findByTarif (@Param("designation") String designation, @Param("tarif") Double tarif);

    @Query("select m from MakeUp m where m.marque = ?1")
    List<MakeUp> findByMarque (Marque marque);

    List<MakeUp> findByMarqueIdMarque(Long id);

    List<MakeUp> findByOrderByDesignationAsc();

    @Query("select m from MakeUp m order by m.designation ASC, m.tarif DESC")
    List<MakeUp> trierMakeUpDesignationTarif ();


}
