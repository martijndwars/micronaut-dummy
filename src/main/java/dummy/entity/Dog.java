package dummy.entity;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Builder
@Data
@ToString
public class Dog {

  public String name;
}
