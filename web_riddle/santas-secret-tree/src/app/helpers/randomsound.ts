import { routerNgProbeToken } from '@angular/router/src/router_module';

export class RandomSound {
    public secretHidden = true;

    public randomFunction() {
      const audio = new Audio();
      audio.src = '../assets/audio/code_found_bell.mp3';
      audio.load();
      audio.play();
      this.secretHidden = false;
    }
}