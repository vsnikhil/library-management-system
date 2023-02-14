package com.db.libmanagementsystem.Repository;

import com.db.libmanagementsystem.Model.Borrower;
import com.db.libmanagementsystem.Model.Fines;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface FinesRepository {
    @Query("select f from Fines b where f.loanId=:loan_id")
    Fines isPaid(@Param("loan_id") String loanId);

    @Modifying
    @Query("update Fines f set f.amt=:fines.amt and f.paid=:fines.paid f where f.loanId=:fin")
    int updateFines(@RequestParam("fines") Fines fines);
}
