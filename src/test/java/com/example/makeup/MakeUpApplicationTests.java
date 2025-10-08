package com.example.makeup;

import com.example.makeup.entities.MakeUp;
import com.example.makeup.entities.Marque;
import com.example.makeup.repository.MakeUpRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.List;

@SpringBootTest
class MakeUpApplicationTests {

    @Autowired
    private MakeUpRepository makeUpRepository;

    @Test
    public void testCreateMakeUp() {
        MakeUp makeUp = new MakeUp("Fond de teint éclat", "Teint", 49.99, new Date());
        makeUpRepository.save(makeUp);
    }

    @Test
    public void testFindMakeUp()
    {
        MakeUp m = makeUpRepository.findById(3L).get();
        System.out.println(m);
    }


    @Test
    public void testUpdateMakeUp()
    {
        MakeUp m = makeUpRepository.findById(3L).get();
        m.setTarif(59.99);
        makeUpRepository.save(m);
        System.out.println(m);
    }

    @Test
    public void testDeleteMakeUp()
    {
        makeUpRepository.deleteById((long) 1L);

    }

    @Test
    public void testListerMakeUp()
    {
        List<MakeUp> makeup = makeUpRepository.findAll();
        for (MakeUp m : makeup)
        {
            System.out.println(m);
        }
    }

    @Test
    public void testFindByDesignation()
    {
        List<MakeUp>  prodMakeUp =makeUpRepository.findByDesignation("Fond de teint éclat");
        for (MakeUp m: prodMakeUp)        {
            System.out.println(m);
        }

    }

    @Test
    public void testFindByDesignationContains()
    {
        List<MakeUp>  prodMakeUp =makeUpRepository.findByDesignationContains("éclat");
        for (MakeUp m: prodMakeUp)
        {
            System.out.println(m);
        }

    }
    @Test
    public void testfindByTarif()
    {
        List<MakeUp> prods = makeUpRepository.findByTarif("Fond de teint éclat",39.99 );
        for (MakeUp m : prods)
        {
            System.out.println(m);
        }
    }

    @Test
    public void testfindByMarque()
    {
        Marque mrq = new Marque();
        mrq.setIdMarque(1L);
        List<MakeUp>  prods = makeUpRepository.findByMarque(mrq);
        for (MakeUp p : prods)
        {
            System.out.println(p);
        }
    }

    @Test
    public void findByMarqueIdMarque()
    {
        List<MakeUp>  prods = makeUpRepository.findByMarqueIdMarque(1L);
        for (MakeUp p : prods)
        {
            System.out.println(p);
        }
    }

    @Test
    public void findByOrderByDesignationAsc()
    {
        List<MakeUp> prods = makeUpRepository.findByOrderByDesignationAsc();
        for (MakeUp m : prods)
        {
            System.out.println(m);
        }
    }

    @Test
    public void trierMakeUpDesignationTarif()
    {
        List<MakeUp> prods = makeUpRepository.trierMakeUpDesignationTarif();
        for (MakeUp m : prods)
        {
            System.out.println(m);
        }
    }
}
