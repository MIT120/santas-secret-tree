import { environment } from './environment/environment';

export class AppSettings {
  public static API_ENTPOINT = environment.baseUrl;
}

export class TwitterSettings {
  public static API_AUTH_ENDPOINT = environment.twiterUrl;
  public static CLIENT_ID = environment.client_id;
}
