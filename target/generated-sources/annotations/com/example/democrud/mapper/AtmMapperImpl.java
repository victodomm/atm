package com.example.democrud.mapper;

import com.example.democrud.persistence.entity.Accounts;
import com.task.openapi.model.Account;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-11-19T12:29:54+0100"
)
@Component
public class AtmMapperImpl implements AtmMapper {

    @Override
    public List<Account> EntityAccountListToEntityModelListDto(List<Accounts> list) {
        if ( list == null ) {
            return null;
        }

        List<Account> list1 = new ArrayList<Account>( list.size() );
        for ( Accounts accounts : list ) {
            list1.add( EntityAccountToEntityModelDto( accounts ) );
        }

        return list1;
    }

    @Override
    public Account EntityAccountToEntityModelDto(Accounts account) {
        if ( account == null ) {
            return null;
        }

        Account account1 = new Account();

        account1.setAccountId( account.getAccount() );
        if ( account.getBalance() != null ) {
            account1.setBalance( account.getBalance().floatValue() );
        }

        return account1;
    }
}
