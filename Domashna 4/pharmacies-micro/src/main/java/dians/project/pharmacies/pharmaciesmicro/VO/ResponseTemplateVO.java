package dians.project.pharmacies.pharmaciesmicro.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplateVO {
    private Pharmacy[] pharmacies;
    private Municipality municipality;
    private Municipality[] municipalities;
}