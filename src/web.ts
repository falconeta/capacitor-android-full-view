import { WebPlugin } from '@capacitor/core';

import type { AndroidInsetsPlugin, TopBottomReturn } from './definitions';

export class AndroidInsetsWeb extends WebPlugin implements AndroidInsetsPlugin {
  async top(): Promise<TopBottomReturn> {
    return { value: 0 };
  }

  async bottom(): Promise<TopBottomReturn> {
    return { value: 0 };
  }
}
