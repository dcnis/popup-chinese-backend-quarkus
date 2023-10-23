package de.schmidtdennis.popupchinese.quarkus.converter;

import de.schmidtdennis.popupchinese.quarkus.model.dataobject.DialogDO;
import de.schmidtdennis.popupchinese.quarkus.model.request.DialogAddReq;
import de.schmidtdennis.popupchinese.quarkus.model.valueobject.DialogVO;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class DialogConverter {

    public DialogDO toDO(DialogAddReq dialog) {
        DialogDO newDialog = new DialogDO();
        newDialog.setLessonId(dialog.getLessonId());
        newDialog.setChinese(dialog.getChinese());
        newDialog.setPinyin(dialog.getPinyin());
        newDialog.setEnglish(dialog.getEnglish());
        newDialog.setSpeaker(dialog.getSpeaker());
        newDialog.setDialogOrder(dialog.getDialogOrder());

        return newDialog;
    }

    public DialogVO toVO(DialogDO dialogDO) {
        DialogVO dialogVO = new DialogVO();

        dialogVO.setId(dialogDO.getId());
        dialogVO.setLessonId(dialogDO.getLessonId());
        dialogVO.setChinese(dialogDO.getChinese());
        dialogVO.setPinyin(dialogDO.getPinyin());
        dialogVO.setEnglish(dialogDO.getEnglish());
        dialogVO.setSpeaker(dialogDO.getSpeaker());
        dialogVO.setDialogOrder(dialogDO.getDialogOrder());

        return dialogVO;
    }
}
