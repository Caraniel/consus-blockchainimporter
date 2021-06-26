package caraniel.consus.blockchainimporter.dbimporter;

import caraniel.consus.blockchainimporter.BlockchainImporter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

@Component
public class DBBlockchainImporter
  implements BlockchainImporter
{
  private final DataSource dataSource;

  public DBBlockchainImporter(@Autowired DataSource dataSource)
  {
    this.dataSource = dataSource;
  }

  public long getMaxBlockHeight()
  {

    return 0;
  }
}
