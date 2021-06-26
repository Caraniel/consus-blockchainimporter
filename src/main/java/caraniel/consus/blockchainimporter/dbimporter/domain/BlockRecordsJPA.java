package caraniel.consus.blockchainimporter.dbimporter.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="block_records")
public class BlockRecordsJPA
{
  @Id
  @Column(name = "header_hash")
  private String headerHash;

  @Column(name = "height")
  private long height;
}
