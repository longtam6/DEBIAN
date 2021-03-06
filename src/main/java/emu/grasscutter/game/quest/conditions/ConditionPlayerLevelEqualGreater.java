package emu.grasscutter.game.quest.conditions;

import emu.grasscutter.data.custom.QuestConfigData.QuestCondition;
import emu.grasscutter.game.quest.QuestValue;
import emu.grasscutter.game.quest.GameQuest;
import emu.grasscutter.game.quest.enums.QuestTriggerType;
import emu.grasscutter.game.quest.handlers.QuestBaseHandler;

@QuestValue(QuestTriggerType.QUEST_COND_PLAYER_LEVEL_EQUAL_GREATER)
public class ConditionPlayerLevelEqualGreater extends QuestBaseHandler {

	@Override
	public boolean execute(GameQuest quest, QuestCondition condition, int... params) {
		return quest.getOwner().getLevel() >= condition.getParam()[0];
	}
	
}
