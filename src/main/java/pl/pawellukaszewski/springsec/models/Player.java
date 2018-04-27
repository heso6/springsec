package pl.pawellukaszewski.springsec.models;

public class Player {
    private String name;
    private int lvl;
    private int attack;
    private int defence;
    private String nickanem;

    private Player(Builder builder) {
        name = builder.name;
        lvl = builder.lvl;
        attack = builder.attack;
        defence = builder.defence;
        nickanem = builder.nickanem;
    }

    static class Builder {
        private String name;
        private int lvl;
        private int attack;
        private int defence;
        private String nickanem;


        public Builder(String name) {
            this.name = name;
        }

        public Builder setLvl(int lvl) {
            this.lvl = lvl;
            return this;
        }

        public Builder setAttack(int attack) {
            this.attack = attack;
            return this;
        }

        public Builder setDefence(int defence) {
            this.defence = defence;
            return this;
        }

        public Builder setNickanem(String nickanem) {
            this.nickanem = nickanem;
            return this;
        }

        public Player build() {
            return new Player(this);
        }
    }
}
