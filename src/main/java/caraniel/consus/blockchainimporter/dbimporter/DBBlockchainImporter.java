package caraniel.consus.blockchainimporter.dbimporter;

import caraniel.consus.blockchainimporter.BlockchainImporter;

import javax.sql.DataSource;

public class DBBlockchainImporter
  implements BlockchainImporter
{
  private DataSource dataSource;

  public DBBlockchainImporter(DataSource dataSource)
  {
    this.dataSource = dataSource;
  }

  public long getMaxBlockHeight()
  {

    return 0;
  }
}
