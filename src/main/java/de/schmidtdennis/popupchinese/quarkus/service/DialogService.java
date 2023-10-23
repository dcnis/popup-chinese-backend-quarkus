package de.schmidtdennis.popupchinese.quarkus.service;

import de.schmidtdennis.popupchinese.quarkus.converter.DialogConverter;
import de.schmidtdennis.popupchinese.quarkus.model.dataobject.DialogDO;
import de.schmidtdennis.popupchinese.quarkus.model.request.DialogAddReq;
import de.schmidtdennis.popupchinese.quarkus.model.valueobject.DialogVO;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.NotFoundException;

import java.util.List;
import java.util.stream.Collectors;

@ApplicationScoped
public class DialogService {

    @Inject
    private DialogConverter dialogConverter;

    @Transactional
    public DialogVO add(DialogAddReq dialog){
        DialogDO dialogDO = dialogConverter.toDO(dialog);
        dialogDO.persist();
        return dialogConverter.toVO(dialogDO);
    }

    public DialogVO getById(Integer id){
        DialogDO dialogDO = DialogDO.findById(id);

        if(dialogDO == null){
            throw new NotFoundException();
        }

        return dialogConverter.toVO(dialogDO);
    }

    public List<DialogVO> getAll(){
        List<DialogDO> dialogDOs = DialogDO.listAll();
        return dialogDOs.stream()
                .map(dialogDO -> dialogConverter.toVO(dialogDO))
                .collect(Collectors.toList());
    }

    @Transactional
    public boolean delete(Integer id) {
        return DialogDO.deleteById(id);
    }

    public List<DialogVO> getByLessonId(Long lessonId) {
        List<DialogDO> dialogDOs = DialogDO.list("lessonId", lessonId);

        return dialogDOs.stream()
                .map(dialogDO -> dialogConverter.toVO(dialogDO))
                .collect(Collectors.toList());
    }
}
